package PanelAttackPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GameData 
{
	public GameData()
	{
		
		ArrayList <ButtonBlocks> someName = new ArrayList<ButtonBlocks> ();

		JButton REDButtonBlock = new ButtonBlocks();
		REDButtonBlock.setBounds(((ButtonBlocks) REDButtonBlock).getInitialX(),((ButtonBlocks) REDButtonBlock).getInitialY(), ((ButtonBlocks) REDButtonBlock).getBlockWidth(), ((ButtonBlocks) REDButtonBlock).getBlockHeight());
		REDButtonBlock.setEnabled(false);
		REDButtonBlock.setVisible(true);
		REDButtonBlock.setText(" ");
		REDButtonBlock.setBackground(Color.RED);
		someName.add((ButtonBlocks) REDButtonBlock);
		
		
		ButtonBlocks BLACKButtonBlock = new ButtonBlocks();
		BLACKButtonBlock.setBounds(BLACKButtonBlock.getInitialX(),BLACKButtonBlock.getInitialY(), BLACKButtonBlock.getBlockWidth(), BLACKButtonBlock.getBlockHeight());
		BLACKButtonBlock.setEnabled(false);
		BLACKButtonBlock.setVisible(true);
		BLACKButtonBlock.setText(" ");
		BLACKButtonBlock.setBackground(Color.RED);
		someName.add(BLACKButtonBlock);
		
		
		ButtonBlocks BLUEButtonBlock = new ButtonBlocks();
		BLUEButtonBlock.setBounds(BLUEButtonBlock.getInitialX(),BLUEButtonBlock.getInitialY(), BLUEButtonBlock.getBlockWidth(), BLUEButtonBlock.getBlockHeight());
		BLUEButtonBlock.setEnabled(false);
		BLUEButtonBlock.setVisible(true);
		BLUEButtonBlock.setText(" ");
		BLUEButtonBlock.setBackground(Color.RED);
		someName.add(BLUEButtonBlock);
		
		
		ButtonBlocks CYANButtonBlock = new ButtonBlocks();
		CYANButtonBlock.setBounds(CYANButtonBlock.getInitialX(),CYANButtonBlock.getInitialY(), CYANButtonBlock.getBlockWidth(), CYANButtonBlock.getBlockHeight());
		CYANButtonBlock.setEnabled(false);
		CYANButtonBlock.setVisible(true);
		CYANButtonBlock.setText(" ");
		CYANButtonBlock.setBackground(Color.RED);
		someName.add(CYANButtonBlock);
		
		
		ButtonBlocks GREENButtonBlock = new ButtonBlocks();
		GREENButtonBlock.setBounds(GREENButtonBlock.getInitialX(),GREENButtonBlock.getInitialY(), GREENButtonBlock.getBlockWidth(), GREENButtonBlock.getBlockHeight());
		GREENButtonBlock.setEnabled(false);
		GREENButtonBlock.setVisible(true);
		GREENButtonBlock.setText(" ");
		GREENButtonBlock.setBackground(Color.RED);
		someName.add(GREENButtonBlock);
		
		
		ButtonBlocks ORANGEButtonBlock = new ButtonBlocks();
		ORANGEButtonBlock.setBounds(ORANGEButtonBlock.getInitialX(),ORANGEButtonBlock.getInitialY(), ORANGEButtonBlock.getBlockWidth(), ORANGEButtonBlock.getBlockHeight());
		ORANGEButtonBlock.setEnabled(false);
		ORANGEButtonBlock.setVisible(true);
		ORANGEButtonBlock.setText(" ");
		ORANGEButtonBlock.setBackground(Color.RED);
		someName.add(ORANGEButtonBlock);
		
		
		ButtonBlocks PINKButtonBlock = new ButtonBlocks();
		PINKButtonBlock.setBounds(PINKButtonBlock.getInitialX(),PINKButtonBlock.getInitialY(), PINKButtonBlock.getBlockWidth(), PINKButtonBlock.getBlockHeight());
		PINKButtonBlock.setEnabled(false);
		PINKButtonBlock.setVisible(true);
		PINKButtonBlock.setText(" ");
		PINKButtonBlock.setBackground(Color.RED);
		someName.add(PINKButtonBlock);
		
		
		ButtonBlocks MAGENTAButtonBlock = new ButtonBlocks();
		MAGENTAButtonBlock.setBounds(MAGENTAButtonBlock.getInitialX(),MAGENTAButtonBlock.getInitialY(), MAGENTAButtonBlock.getBlockWidth(), MAGENTAButtonBlock.getBlockHeight());
		MAGENTAButtonBlock.setEnabled(false);
		MAGENTAButtonBlock.setVisible(true);
		MAGENTAButtonBlock.setText(" ");
		MAGENTAButtonBlock.setBackground(Color.RED);
		someName.add(MAGENTAButtonBlock);

		
	}
	
	
	
	
	
	
	
	
	
	
	
}