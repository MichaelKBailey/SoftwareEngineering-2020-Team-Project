package PanelAttackPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BlockBlueprint 
{
	public BlockBlueprint()
	{
		
		ArrayList <Block> someName = new ArrayList<Block> ();

		JButton REDButtonBlock = new Block();
		REDButtonBlock.setBounds(((Block) REDButtonBlock).getInitialX(),((Block) REDButtonBlock).getInitialY(), ((Block) REDButtonBlock).getBlockWidth(), ((Block) REDButtonBlock).getBlockHeight());
		REDButtonBlock.setEnabled(false);
		REDButtonBlock.setVisible(true);
		REDButtonBlock.setText(" ");
		REDButtonBlock.setBackground(Color.RED);
		someName.add((Block) REDButtonBlock);
		
		
		Block BLACKButtonBlock = new Block();
		BLACKButtonBlock.setBounds(BLACKButtonBlock.getInitialX(),BLACKButtonBlock.getInitialY(), BLACKButtonBlock.getBlockWidth(), BLACKButtonBlock.getBlockHeight());
		BLACKButtonBlock.setEnabled(false);
		BLACKButtonBlock.setVisible(true);
		BLACKButtonBlock.setText(" ");
		BLACKButtonBlock.setBackground(Color.RED);
		someName.add(BLACKButtonBlock);
		
		
		Block BLUEButtonBlock = new Block();
		BLUEButtonBlock.setBounds(BLUEButtonBlock.getInitialX(),BLUEButtonBlock.getInitialY(), BLUEButtonBlock.getBlockWidth(), BLUEButtonBlock.getBlockHeight());
		BLUEButtonBlock.setEnabled(false);
		BLUEButtonBlock.setVisible(true);
		BLUEButtonBlock.setText(" ");
		BLUEButtonBlock.setBackground(Color.RED);
		someName.add(BLUEButtonBlock);
		
		
		Block CYANButtonBlock = new Block();
		CYANButtonBlock.setBounds(CYANButtonBlock.getInitialX(),CYANButtonBlock.getInitialY(), CYANButtonBlock.getBlockWidth(), CYANButtonBlock.getBlockHeight());
		CYANButtonBlock.setEnabled(false);
		CYANButtonBlock.setVisible(true);
		CYANButtonBlock.setText(" ");
		CYANButtonBlock.setBackground(Color.RED);
		someName.add(CYANButtonBlock);
		
		
		Block GREENButtonBlock = new Block();
		GREENButtonBlock.setBounds(GREENButtonBlock.getInitialX(),GREENButtonBlock.getInitialY(), GREENButtonBlock.getBlockWidth(), GREENButtonBlock.getBlockHeight());
		GREENButtonBlock.setEnabled(false);
		GREENButtonBlock.setVisible(true);
		GREENButtonBlock.setText(" ");
		GREENButtonBlock.setBackground(Color.RED);
		someName.add(GREENButtonBlock);
		
		
		Block ORANGEButtonBlock = new Block();
		ORANGEButtonBlock.setBounds(ORANGEButtonBlock.getInitialX(),ORANGEButtonBlock.getInitialY(), ORANGEButtonBlock.getBlockWidth(), ORANGEButtonBlock.getBlockHeight());
		ORANGEButtonBlock.setEnabled(false);
		ORANGEButtonBlock.setVisible(true);
		ORANGEButtonBlock.setText(" ");
		ORANGEButtonBlock.setBackground(Color.RED);
		someName.add(ORANGEButtonBlock);
		
		
		Block PINKButtonBlock = new Block();
		PINKButtonBlock.setBounds(PINKButtonBlock.getInitialX(),PINKButtonBlock.getInitialY(), PINKButtonBlock.getBlockWidth(), PINKButtonBlock.getBlockHeight());
		PINKButtonBlock.setEnabled(false);
		PINKButtonBlock.setVisible(true);
		PINKButtonBlock.setText(" ");
		PINKButtonBlock.setBackground(Color.RED);
		someName.add(PINKButtonBlock);
		
		
		Block MAGENTAButtonBlock = new Block();
		MAGENTAButtonBlock.setBounds(MAGENTAButtonBlock.getInitialX(),MAGENTAButtonBlock.getInitialY(), MAGENTAButtonBlock.getBlockWidth(), MAGENTAButtonBlock.getBlockHeight());
		MAGENTAButtonBlock.setEnabled(false);
		MAGENTAButtonBlock.setVisible(true);
		MAGENTAButtonBlock.setText(" ");
		MAGENTAButtonBlock.setBackground(Color.RED);
		someName.add(MAGENTAButtonBlock);

		
	}
	
	
	
	
	
	
	
	
	
	
	
}
